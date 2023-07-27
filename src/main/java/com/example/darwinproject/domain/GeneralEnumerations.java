package com.example.darwinproject.domain;

public class GeneralEnumerations {
    public enum GeneralType {
        RESIDENTIAL(1L),
        VIP(2L),
        CORPO(3L);

        private Long id;

        GeneralType(Long id){
            this.id = id;
        }

        public Long getId() {
            return id;
        };

        public void setId(Long id) {
            this.id = id;
        }
    }
}
