package com.nli.probation;

import com.nli.probation.constant.EntityStatusEnum.OfficeStatusEnum;
import com.nli.probation.constant.EntityStatusEnum.RoleStatusEnum;
import com.nli.probation.constant.EntityStatusEnum.TeamStatusEnum;
import com.nli.probation.constant.EntityStatusEnum.UserAccountStatusEnum;

public class MockConstants {

  private MockConstants() {

  }

  public static final int OFFICE_ID = 1;
  public static final String OFFICE_NAME = "Tan Vien";
  public static final String OFFICE_LOCATION = "Tan Binh";
  public static final int OFFICE_STATUS = OfficeStatusEnum.ACTIVE.ordinal();
  public static final int NOT_FOUND_OFFICE_ID = Integer.MAX_VALUE;
  public static final String SEARCH_VALUE = "";
  public static final int INDEX = 0;
  public static final int LIMIT = 1;
  public static final String SORT_BY = "id";
  public static final String SORT_TYPE = "asc";
  public static final int TOTAL_RESULT = 1;
  public static final int TOTAL_PAGE = 1;
  public static final int ROLE_ID = 1;
  public static final String ROLE_NAME = "Software Engineer";
  public static final String ROLE_SHORT_NAME = "SE";
  public static final int ROLE_STATUS = RoleStatusEnum.ACTIVE.ordinal();
  public static final int NOT_FOUND_ROLE_ID = Integer.MAX_VALUE;
  public static final int TEAM_ID = 1;
  public static final String TEAM_NAME = "Lexis&Nexis Insurance";
  public static final String TEAM_SHORT_NAME = "LNI";
  public static final int TEAM_STATUS = TeamStatusEnum.ACTIVE.ordinal();
  public static final int NOT_FOUND_TEAM_ID = Integer.MAX_VALUE;
  public static final int ACCOUNT_ID = 1;
  public static final String ACCOUNT_NAME = "Le Minh Tuan";
  public static final String ACCOUNT_EMAIL = "minhtuan@gmail.com";
  public static final String ACCOUNT_PHONE = "0987654321";
  public static final int ACCOUNT_STATUS = UserAccountStatusEnum.ACTIVE.ordinal();
  public static final int NOT_FOUND_ACCOUNT_ID = Integer.MAX_VALUE;
  public static final int SUCCESS_STATUS_CODE = 200;
  public static final String SUCSESS_MESSAGE = "OK";
}
