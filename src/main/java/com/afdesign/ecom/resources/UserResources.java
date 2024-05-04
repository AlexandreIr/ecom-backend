package com.afdesign.ecom.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afdesign.ecom.entities.User;

@RestController
@RequestMapping(value="/book")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<List<User>> findaAll(){
		List<User> list = new ArrayList<>();
		User u = new User(1L, "Alexandre", "alex.silva250@hotmail.com", "+55119999999", "123456");
		User u2 = new User(2L, "Maria", "maria888@gmail.com", "+55118888888", "654321");
		User u3 = new User(3L, "Adailde", "silvaadailde@gmail.com", "+551177777777", "556124");
		list.add(u);
		list.add(u2);
		list.add(u3);
		return ResponseEntity.ok().body(list);
	}
}
