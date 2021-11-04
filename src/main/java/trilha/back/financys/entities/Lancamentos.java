package trilha.back.financys.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Lancamentos {


    private String name;
    private String description;
    private String type;
    private String amount;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataLancamento;
    private boolean paid;

    public Lancamentos() {
    }

    public Lancamentos(String name, String description, String type, String amount, LocalDate dataLancamento,
                       boolean paid) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.dataLancamento = dataLancamento;
        this.paid = paid;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

}
