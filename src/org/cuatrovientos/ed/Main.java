package org.cuatrovientos.ed;

public class Main {

    public static void main(String[] args) {

        Blog blog = new Blog();

        Post post1 = new Post(1, "Post uno", "Hola que tal, yo soy Ibai");
        blog.addPost(post1);

        Post post2 = new Post(2, "Post dos", "Kaixo zer moduz, ni Ibai naiz");
        blog.addPost(post2);
        
        Post post = blog.getPost(1);
        post.showPost();

        Post postEliminar = blog.getPost(1);
        if (null != postEliminar) {
            blog.removePost(1);
        }

        // he puesto solo hasta 1 ya que sino da error porque no hay tantos posts creados
        for (int i = 0; i < 1; i++) {
        	System.out.println(blog.getPost(i).toString());
        }
    }
}
