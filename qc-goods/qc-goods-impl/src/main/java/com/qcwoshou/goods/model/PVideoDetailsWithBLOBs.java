package com.qcwoshou.goods.model;

public class PVideoDetailsWithBLOBs extends PVideoDetails {
    private String brief;

    private String description;

    private String notes;

    private String stockRemind;

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getStockRemind() {
        return stockRemind;
    }

    public void setStockRemind(String stockRemind) {
        this.stockRemind = stockRemind == null ? null : stockRemind.trim();
    }
}