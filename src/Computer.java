public class Computer {
    String company;
    String cpu;
    int memory;

    public Computer(String company, String cpu, int memory) {
        this.company = company;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "company='" + company + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory=" + memory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;

        Computer computer = (Computer) o;

        if (memory != computer.memory) return false;
        if (company != null ? !company.equals(computer.company) : computer.company != null) return false;
        return cpu != null ? cpu.equals(computer.cpu) : computer.cpu == null;
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (cpu != null ? cpu.hashCode() : 0);
        result = 31 * result + memory;
        return result;
    }
}
