package br.com.validacpf.controller;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ResponseDto implements Serializable {

    private String status;
}
