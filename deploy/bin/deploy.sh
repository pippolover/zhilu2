

tomcat_dir=/home/admin/tomcat
logs_dir=/home/admin/logs
webapps_dir=/home/admin/webapps

env_config=/home/admin/acc.conf
env=""
env="`grep '^env' $env_config | cut -d= -f2`"
if [ "$env" != "" ]; then
        JAVA_OPTS=" -Dspring.profiles.active=$env "
        export JAVA_OPTS
fi

echo "�ر�tomcat ..."
sh $tomcat_dir/bin/shutdown.sh
echo "�ȴ�tomcat shutdown"
sleep 5
killall java
sleep 5


if [ "$1" == "cleanlog" ]; then
	echo "ɾ���ɵ���־�ļ�"
	rm -rf $logs_dir
fi

echo "���¾�̬��Դ"
rm -rf /home/admin/assets
cp -R /home/admin/source/assets /home/admin/assets


echo "���tomcat webappsĿ¼"
rm -rf $webapps_dir/*

echo "����war����tomcat..."
cp /home/admin/source/app/target/app.war $webapps_dir

echo "����tomcat ..."
sh $tomcat_dir/bin/startup.sh
sleep 5
echo "tomcat �������"

