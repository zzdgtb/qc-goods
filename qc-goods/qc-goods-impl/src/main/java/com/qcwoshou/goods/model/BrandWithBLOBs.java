package com.qcwoshou.goods.model;

public class BrandWithBLOBs extends Brand {
    private String brief;

    private String tag;

    private String tagMatch;

    private String tagMatchRow;

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getTagMatch() {
        return tagMatch;
    }

    public void setTagMatch(String tagMatch) {
        this.tagMatch = tagMatch == null ? null : tagMatch.trim();
    }

    public String getTagMatchRow() {
        return tagMatchRow;
    }

    public void setTagMatchRow(String tagMatchRow) {
        this.tagMatchRow = tagMatchRow == null ? null : tagMatchRow.trim();
    }
}