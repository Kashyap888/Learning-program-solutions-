import React from 'react';
import Post from './Post'; 

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: []
        };
    }
    loadPosts = () => {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const postObjects = data.map(post =>
                    new Post(post.userId, post.id, post.title, post.body)
                );
                this.setState({ posts: postObjects });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
            });
    }
    componentDidMount() {
        this.loadPosts();
    }
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.toString());
    console.error("Error Info:", info);
  }
render() {
  return (
    <div>
      <h1>Blog Posts</h1>
      {this.state.posts.map(post => (
        <div key={post.id}>
          <h3>{post.title}</h3>
          <p>{post.body}</p>
        </div>
      ))}
    </div>
  );
}

}

export default Posts;