package com.examen;


public class Project {
    private int id;
    private String libelle;
    private String startDate;
    private String endDate;
    private int totalTasks;
    private double cost;
    private String type;
    private String Superviseur ;


    public Project(int id, String name, String startDate, String endDate, int totalTasks, double cost, String type, String Superviseur) {
        this.id = id;
        this.libelle = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalTasks = totalTasks;
        this.cost = cost;
        this.type = type;
        this.Superviseur = Superviseur;
    }

  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return libelle;
    }

    public void setName(String name) {
        this.libelle = libelle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(int totalTasks) {
        this.totalTasks = totalTasks;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSuperviseur() {
        return Superviseur;
    }
    public void setSuperviseur(String Superviseur) {
        this.Superviseur = Superviseur;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + libelle + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", totalTasks=" + totalTasks +
                ", cost=" + cost +
                '}';
    }


	public void createProject() {
		// TODO Auto-generated method stub
		System.out.println("Project created");
	}
}
