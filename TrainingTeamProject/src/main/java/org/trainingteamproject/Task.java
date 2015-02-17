package org.trainingteamproject;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "task", eager = true)
@SessionScoped
public class Task {
	
	private int idTask;
	private String nameTask;
	private String descriptionTask;
	private int voteTask;
	private int secondsRemaining;
	
	public String getDescriptionTask() {
		return descriptionTask;
	}
	
	public void setDescriptionTask(String descriptionTask) {
		this.descriptionTask = descriptionTask;
	}
	
	public int getSecondsRemaining() {
		return secondsRemaining;
	}
	public void setSecondsRemaining(int secondsRemaining) {
		this.secondsRemaining = secondsRemaining;
	}
	public int getIdTask() {
		return idTask;
	}
	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}
	public String getNameTask() {
		return nameTask;
	}
	public void setNameTask(String nameTask) {
		this.nameTask = nameTask;
	}
	public int getVoteTask() {
		return voteTask;
	}
	public void setVoteTask(int voteTask) {
		this.voteTask = voteTask;
	}

}
