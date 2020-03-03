//package com.example.graphqldemo;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import io.leangen.graphql.annotations.GraphQLArgument;
//import io.leangen.graphql.annotations.GraphQLMutation;
//
//@Service
//public class UserService {
//
//	@Autowired
//	UserRepository userRepository;
//
//	@GraphQLMutation(name = "createUser")
//	public User createUser(@GraphQLArgument(name = "user") User user) {
//		user = userRepository.save(user);
//		return user;
//	}
//
//	@GraphQLMutation(name = "updateUser")
//	public User updateUser(@GraphQLArgument(name = "user") User user) throws Exception {
//		User dbuser = getUserById(user.getId());
//		user = userRepository.save(user);
//		return user;
//	}
//
//	@GraphQLMutation(name = "deleteCar")
//	public void deleteUser(@GraphQLArgument(name = "id") long id) throws Exception {
//		try {
//			if(userRepository.existsById(id))
//				userRepository.deleteById(id);
//		} catch (Exception e) {
//			throw new Exception("User not deleted");
//		}
//	}
//
//	public User getUserById(long id) throws Exception {
//		Optional<User> user = userRepository.findById(id);
//		if (!user.isPresent()) {
//			throw new Exception("User not found");
//		}
//		return user.get();
//	}
//
//
//}
