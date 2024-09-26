package com.klapertart.elasticsearch.model;

import lombok.Data;

/**
 * @author klapertart
 * @since 9/26/2024
 */

@Data
public class ProductDocResponse {
    private String _index;
    private String _id;
    private Integer _version;
    private Integer _seq_no;
    private Integer _primary_term;
    private Boolean found;
    private Product _source;

    @Data
    public static class Product {
        private String name;
        private Long price;
    }
}
