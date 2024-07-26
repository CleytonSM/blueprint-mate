package com.blueprintmate.model.dto;

import java.util.List;

public class PageResponseDTO<T> {
    private int pageNumber;
    private int pageSize;
    private List<T> records;

    public PageResponseDTO() {
    }

    public PageResponseDTO(int pageNumber, int pageSize, List<T> records) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.records = records;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }
}
