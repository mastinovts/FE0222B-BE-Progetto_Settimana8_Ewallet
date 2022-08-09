package com.banca.ws;

import com.banca.dao.ContoCorrenteDAO;
import com.banca.dao.impl.ContoCorrenteDAOImpl;
import com.banca.model.ContoCorrente;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conto")
public class ContoCorrenteRestController {
	
	@PostMapping("/insert")
	public ResponseEntity <String> insert(@RequestBody ContoCorrente cc){
		ContoCorrenteDAO contoDAO = new ContoCorrenteDAOImpl();
		contoDAO.insert(cc);
		
		return new ResponseEntity <String>("Conto Corrente aggiunto correttamente", HttpStatus.OK);
	}

}
