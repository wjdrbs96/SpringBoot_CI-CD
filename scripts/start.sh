ABSPATH=$(readlink -f $0)
ABSDIR=$(dirname $ABSPATH)
source ${ABSDIR}/profile.sh

REPOSITORY=/home/ec2-user/app/step3

PROJENCT_NAME=SpringBoot_CI-CD

echo "> Build 파일 복사"
echo "> cp $REPOSITORY/zip/*jar ${REPOSITORY}/"

cp $REPOSITORY/zip/*jar $REPOSITORY/

JAR_NAME=$(ls -tr $REPOSITORY/*.jar | tail -n 1)

echo "> JAR Name: $JAR_Name"

echo "> JAR_Name 에 실행 권한 추가"

chmod *x $JAR_NAME

IDLE_PROFILE=$(find_idle_profile)

echo "> $JAR_NAME 를 profile=$IDLE_PROFILE 로 실행합니다."

nohup java -jar $JAR_NAME > $REPOSITORY/nohup.out 2>&1 &