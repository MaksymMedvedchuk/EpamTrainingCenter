package chapter5.task15;

public class Computer {

    static class ComputerInner {
        private final String OS;
        private final String CPU;
        private final String RAM;

        public ComputerInner(String OS, String CPU, String RAM) {
            this.OS = OS;
            this.CPU = CPU;
            this.RAM = RAM;
        }

        @Override
        public String toString() {
            return "Operation system: " + OS + "Processor: " + CPU + "Operational memory: " + RAM;
        }
    }
}
