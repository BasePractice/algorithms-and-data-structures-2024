package ru.mirea.practice.s23k0362.comp;

public class Processor {
    public String processorName;
    public String socetProcessor; // тип сокета процессора
    public Double hzproxessor; // частота процессора
    public Integer amountCoresprocessor; // количество ядер
    public Integer amountStreemprocessor; //количество потоков
    public String cahProcessor;
    public Double dischargeProcessor;//разрядность процессора

    public Processor(String processorName, String socetProcessor, Double hzproxessor, Integer amountCoresprocessor,
                     Integer amountStreemprocessor, String cahProcessor, Double dischargeProcessor) {
        this.processorName = processorName;
        this.socetProcessor = socetProcessor;
        this.hzproxessor = hzproxessor;
        this.amountCoresprocessor = amountCoresprocessor;
        this.amountStreemprocessor = amountStreemprocessor;
        this.cahProcessor = cahProcessor;
        this.dischargeProcessor = dischargeProcessor;
    }

    public String getprocessorName() {
        return processorName;
    }

    public void setprocessorName(String processorName) {
        this.processorName = processorName;
    }

    public String getsocetProcessor() {
        return socetProcessor;
    }

    public void setsocetProcessor(String socetProcessor) {
        this.socetProcessor = socetProcessor;
    }

    public Double gethzproxessor() {
        return hzproxessor;
    }

    public void sethzproxessor(Double hzproxessor) {
        this.hzproxessor = hzproxessor;
    }

    public Integer getamountCoresprocessor() {
        return amountCoresprocessor;
    }

    public void setamountCoresprocessor(Integer amountCoresprocessor) {
        this.amountCoresprocessor = amountCoresprocessor;
    }

    public Integer getamountStreemprocessor() {
        return amountStreemprocessor;
    }

    public void setamountStreemprocessor(Integer amountStreemprocessor) {
        this.amountStreemprocessor = amountStreemprocessor;
    }

    public String getcahProcessor() {
        return cahProcessor;
    }

    public void setcahProcessor(String cahProcessor) {
        this.cahProcessor = cahProcessor;
    }

    public Double getdischargeProcessor() {
        return dischargeProcessor;
    }

    public void setdischargeProcessor(Double dischargeProcessor) {
        this.dischargeProcessor = dischargeProcessor;
    }

    @Override
    public String toString() {
        return "Processor{"
                + "socetProcessor='" + socetProcessor + '\''
                + ", hzproxessor=" + hzproxessor
                + ", amountCoresprocessor=" + amountCoresprocessor
                + ", amountStreemprocessor=" + amountStreemprocessor
                + ", cahProcessor='" + cahProcessor + '\''
                + ", dischargeProcessor=" + dischargeProcessor
                + '}';
    }
}
