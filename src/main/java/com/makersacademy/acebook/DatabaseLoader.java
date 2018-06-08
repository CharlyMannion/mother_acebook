package com.makersacademy.acebook;


import com.makersacademy.acebook.model.Post;
import com.makersacademy.acebook.model.Users;
import com.makersacademy.acebook.repository.PostRepository;
import com.makersacademy.acebook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

  private final PostRepository repository;
  private final UserRepository userRepository;

  @Autowired
  public DatabaseLoader(PostRepository repository, UserRepository userRepository) {
  	this.repository = repository;
    this.userRepository = userRepository;
  }


  @Override
  public void run(String... strings) throws Exception {
    this.repository.save(new Post("blah blah"));
    this.userRepository.save(new Users("Igor", "Ryabchuk"));

  }
}
