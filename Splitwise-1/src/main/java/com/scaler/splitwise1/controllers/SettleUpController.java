package com.scaler.splitwise1.controllers;

import com.scaler.splitwise1.dtos.SettleUpGroupRequestDto;
import com.scaler.splitwise1.dtos.SettleUpGroupResponseDto;
import com.scaler.splitwise1.dtos.SettleUpUserRequestDto;
import com.scaler.splitwise1.dtos.SettleUpUserResponseDto;
import com.scaler.splitwise1.models.Expense;
import com.scaler.splitwise1.service.SettleUpService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {

    private SettleUpService settleUpService;

    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    public SettleUpUserResponseDto settleUpUser(SettleUpUserRequestDto requestDto) {
        List<Expense> settleUpExpense = settleUpService.settleUpUser(requestDto.getUserId());
        SettleUpUserResponseDto responseDto = new SettleUpUserResponseDto();
        responseDto.setExpenses(settleUpExpense);
        return responseDto;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto requestDto) {
        return null;
    }
}
