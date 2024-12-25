package com.capstone.ar_guideline.services;

import com.capstone.ar_guideline.dtos.requests.Company.CompanyCreationRequest;
import com.capstone.ar_guideline.dtos.requests.Role.RoleCreationRequest;
import com.capstone.ar_guideline.dtos.responses.Company.CompanyResponse;
import com.capstone.ar_guideline.dtos.responses.Role.RoleResponse;
import com.capstone.ar_guideline.entities.Company;
import com.capstone.ar_guideline.entities.Role;

import java.util.List;

public interface ICompanyService {
  List<CompanyResponse> findAll();

  CompanyResponse findById(String id);

  CompanyResponse findByName(String name);

  CompanyResponse create(CompanyCreationRequest request);

  CompanyResponse update(String id, CompanyCreationRequest request);

  void delete(String id);

  Company findCompanyEntityByName(String name);
}
