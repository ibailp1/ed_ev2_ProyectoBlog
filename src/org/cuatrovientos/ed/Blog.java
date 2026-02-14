package org.cuatrovientos.ed;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    private List<Post> posts;

    public Blog() {
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public Post getPost(int i) {
            return posts.get(i);
    }

    public void removePost(int i) {
            posts.remove(i);
    }

}
