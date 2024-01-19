JSHOMEDIR=`dirname $0`/../..; export JSHOMEDIR
export BUILD_ENV_VAR=value
export ANOTHER_ENV_VAR=value2
. ${JSHOMEDIR}/bin/setenv.sh
./additional_script.sh

"$JAVACMD" ${LOOKUP_GROUPS_PROP} -classpath "${SIGAR_JARS}":"${GS_JARS}":"${ANT_JARS}":"${JAVA_HOME}/lib/tools.jar" org.apache.tools.ant.Main $1