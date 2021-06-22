/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.model;


import java.util.List;
import management.dto.ScannedUserResponse;



/**
 *
 * @author junie
 */
public class ContentResponse{
    private List<ScannedUserResponse> content;
    private Pageable pageable;
    private int totalPages;
    private int totalElements;
    private boolean last;
    private Sort sort;
    
    private int numberOfElements;
    private boolean first;
    private int size;
    private int number;
    private boolean empty;
    
    public ContentResponse(){}

    public ContentResponse(List<ScannedUserResponse> content, Pageable pageable, int totalPages, int totalElements, boolean last, Sort sort, int numberOfElements, boolean first, int size, int number, boolean empty) {
        this.content = content;
        this.pageable = pageable;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.last = last;
        this.sort = sort;
        this.numberOfElements = numberOfElements;
        this.first = first;
        this.size = size;
        this.number = number;
        this.empty = empty;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }
    

    public List<ScannedUserResponse> getContent() {
        return content;
    }

    public void setContent(List<ScannedUserResponse> content) {
        this.content = content;
    }

    public Pageable getPageable() {
        return pageable;
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    
    

    
}
