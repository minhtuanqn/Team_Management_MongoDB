package com.nli.probation.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.nli.probation.constant.EntityStatusEnum.OfficeStatusEnum;
import com.nli.probation.constant.EntityStatusEnum.RoleStatusEnum;
import com.nli.probation.model.office.CreateOfficeModel;
import com.nli.probation.model.office.OfficeModel;
import com.nli.probation.model.role.CreateRoleModel;
import com.nli.probation.model.role.RoleModel;

public class RoleTestUtils {

  /**
   * Create mock role
   * @return mock role model
   */
  public static RoleModel createRoleModel() {
    RoleModel roleModel = new RoleModel();
    roleModel.setId(1);
    roleModel.setName("Software Engineer");
    roleModel.setShortName("SE");
    roleModel.setStatus(RoleStatusEnum.ACTIVE.ordinal());
    return roleModel;
  }

  /**
   * Create mock create role
   * @return mock create role model
   */
  public static CreateRoleModel createCreateRoleModel() {
    CreateRoleModel createRoleModel = new CreateRoleModel();
    createRoleModel.setName("Software Engineer");
    createRoleModel.setShortName("SE");
    return createRoleModel;
  }

  /**
   * Campare two role model
   * @param expected
   * @param actual
   * @return true or false
   */
  public static boolean compareTwoRole(RoleModel expected, RoleModel actual) {
    assertEquals(expected.getId(), actual.getId());
    assertEquals(expected.getName(), actual.getName());
    assertEquals(expected.getShortName(), actual.getShortName());
    assertEquals(expected.getStatus(), actual.getStatus());
    return true;
  }
}