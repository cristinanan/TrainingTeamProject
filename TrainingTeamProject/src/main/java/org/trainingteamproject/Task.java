package org.trainingteamproject;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "task")
@SessionScoped
public class Task implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String taskId = "";
	private String taskName = "";
	private String taskDescription = "";
	private int taskVote;
	private int secondsRemaining;
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public int getTaskVote() {
		return taskVote;
	}
	public void setTaskVote(int taskVote) {
		this.taskVote = taskVote;
	}
	public int getSecondsRemaining() {
		return secondsRemaining;
	}
	public void setSecondsRemaining(int secondsRemaining) {
		this.secondsRemaining = secondsRemaining;
	}
}
