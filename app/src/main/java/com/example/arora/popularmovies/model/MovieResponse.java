package com.example.arora.popularmovies.model;

/**
 * Created by arora on 11/7/16.
 */

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MovieResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<movie> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<movie> getResults() {
        return results;
    }

    public void setResults(List<movie> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
