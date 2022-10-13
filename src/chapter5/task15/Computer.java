package chapter5.task15;

public class Computer {

    private ComputerInfo computerInfo;

    public Computer(ComputerInfo computerInfo) {
        this.computerInfo = computerInfo;
    }

    static class ComputerInfo {
        private final String OS;
        private final String CPU;
        private final String RAM;

        public ComputerInfo(String OS, String CPU, String RAM) {
            this.OS = OS;
            this.CPU = CPU;
            this.RAM = RAM;
        }

        @Override
        public String toString() {
            return "Operation system: " + OS + "Processor: " + CPU + "Operational memory: " + RAM;
        }
    }

    public ComputerInfo getComputerInfo() {
        return computerInfo;
    }

    public void setComputerInfo(ComputerInfo computerInfo) {
        this.computerInfo = computerInfo;
    }

    @Override
    public String toString() {
        return computerInfo.toString();
    }
}
