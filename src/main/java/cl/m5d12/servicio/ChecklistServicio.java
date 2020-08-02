package cl.m5d12.servicio;

import java.util.List;

import cl.m5d12.dao.Checklist;

public interface ChecklistServicio {

	Checklist findAsesoriaByid(int idChecklist);
	List <Checklist> listaCheck();
	void addCheck(Checklist check);
	void deleteChecklist(int idChecklist);
	void updateChecklist(Checklist check);
	
}
