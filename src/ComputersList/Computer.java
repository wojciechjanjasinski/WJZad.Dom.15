package ComputersList;

import java.util.Objects;

public class Computer {
    private String name;
    private double cpuSpeed;
    private double ramMemory;

    public Computer(String name, double cpuSpeed, double ramMemory) {
        this.name = name;
        this.cpuSpeed = cpuSpeed;
        this.ramMemory = ramMemory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public double getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(double ramMemory) {
        this.ramMemory = ramMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.cpuSpeed, cpuSpeed) == 0 &&
                Double.compare(computer.ramMemory, ramMemory) == 0 &&
                name.equals(computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpuSpeed, ramMemory);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpuSpeed=" + cpuSpeed +
                ", ramMemory=" + ramMemory +
                '}';
    }
}
