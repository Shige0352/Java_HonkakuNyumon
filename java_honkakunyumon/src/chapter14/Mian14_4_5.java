package chapter14;


logger.debug("employee= " + employee + ", department" + department);

if (logger.isDebugEnabled()) {
	logger.debug("employee" + employee + ", department=" + department);
}

logger.debug("employee=(), department={}", empployee, department);