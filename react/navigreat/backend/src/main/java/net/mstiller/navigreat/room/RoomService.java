package net.mstiller.navigreat.room;

//import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@Service
public class RoomService {
	
	@Autowired
	private RoomRepository repo;
	
	@GetMapping("/rooms")
	public List<Room> getRooms() {
//		System.out.println(repo.findAll());
		return repo.findAll();
	}
	
	//	takes a JSON string
	@PostMapping("/rooms")
	public String addRoom(@RequestBody Map<String, Object> json) {
//		System.out.println(payload);
		
		return repo.insert(new Room(
		(String) json.get("name")
		)).getId();


//		return repo.insert(new Gson().fromJson(payload, Room.class)).getId();
//		return "null";
	}
	
}
