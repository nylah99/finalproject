package com.example.finalproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Bullhorn {

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTitle() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPostedDate() {
            return posteddate;
        }

        public void setPostedDate(String posteddate) {
            this.posteddate = posteddate;
        }

        public String getSentby() {
            return sentby;
        }

        public void setSentby(String sentby) {
            this.sentby = sentby;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @NotNull
        @Size(min=4)
        private String content;

        @NotNull
        @Size(min=3)
        private String posteddate;


        private String sentby;


    }

