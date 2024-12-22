package com.capstone.ar_guideline.constants;

public class ConstAPI {
  public static class ModelTypeAPI {
    public static final String CREATE_MODEL_TYPE = "api/v1/model-types";
    public static final String UPDATE_MODEL_TYPE = "api/v1/model-types/";
    public static final String DELETE_MODEL_TYPE = "api/v1/model-types/";
  }

  public static class ModelAPI {
    public static final String CREATE_MODEL = "api/v1/model";
    public static final String UPDATE_MODEL = "api/v1/model/";
    public static final String DELETE_MODEL = "api/v1/model/";
  }

  public static class RoleAPI {
    public static final String GET_ROLES = "api/v1/roles";
    public static final String GET_ROLE_BY_ID = "api/v1/role/id";
    public static final String GET_ROLE_BY_NAME = "api/v1/role/name";
    public static final String CREATE_ROLE = "api/v1/role";
    public static final String DELETE_MODEL_TYPE = "api/v1/role/";
  }

  public static class UserAPI {
    public static final String LOGIN = "api/v1/login";
    public static final String REGISTER = "api/v1/register";
  }
}
