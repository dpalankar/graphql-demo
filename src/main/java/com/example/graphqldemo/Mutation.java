//package com.example.graphqldemo;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.coxautodev.graphql.tools.GraphQLMutationResolver;
//
//@Component
//public class Mutation implements GraphQLMutationResolver {
//	@Autowired
//	private UserRepository userRepository;
//
//	public User updateUser(long id, String name) {
//
//		Optional<User> user = userRepository.findById(id);
//		if (user.isPresent()) {
//			User obj = user.get();
//			obj.setName(name);
//			return userRepository.save(obj);
//		}
//		return userRepository.findById(id).get();
//	}
//}