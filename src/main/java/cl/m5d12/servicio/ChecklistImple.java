package cl.m5d12.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.m5d12.dao.Checklist;
import cl.m5d12.dao.ChecklistRepository;
@Service
public class ChecklistImple implements ChecklistServicio{
	
	@Autowired
	ChecklistRepository check;

	@Override
	public Checklist findCheckByid(int idChecklist) {
		return check.findOne(idChecklist);
	}

	@Override
	public List<Checklist> listaCheck() {
		return (List<Checklist>) check.findAll();
	}

	@Override
	public void addCheck(Checklist checkl) {
		check.save(checkl);
		
	}

	@Override
	public void deleteChecklist(int idChecklist) {
		check.delete(idChecklist);
		
	}

	@Override
	public void updateChecklist(Checklist checkl) {
		check.save(checkl);
		
	}
	
}	