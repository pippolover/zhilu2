package com.alipay.basetech.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.basetech.app.dal.MachineDAO;
import com.alipay.basetech.app.model.Machine;
import com.alipay.basetech.app.service.MachineService;

@Service
public class MachineServiceImpl implements MachineService {

	@Autowired
	private MachineDAO machineDAO;

	@Override
	public List<Machine> getAll() {
		return machineDAO.selectAll();
	}

}
