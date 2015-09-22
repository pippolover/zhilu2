package com.alipay.basetech.app.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.basetech.app.model.APIResult;
import com.alipay.basetech.app.model.Machine;
import com.alipay.basetech.app.service.MachineService;
import com.alipay.basetech.app.web.APIExceptionHandler;

@RestController
public class MachineAPI extends APIExceptionHandler {

	@Autowired
	private MachineService machineService;

	@RequestMapping(value = "/api/machines", method = RequestMethod.GET)
	public APIResult<List<Machine>> getAll() {
		return new APIResult<List<Machine>>(machineService.getAll());
	}
}
