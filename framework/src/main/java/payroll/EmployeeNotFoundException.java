package payroll;

import framework.BaseException;

class EmployeeNotFoundException extends BaseException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}