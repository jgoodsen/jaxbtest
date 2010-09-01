cp -r ../pubit_app/src/com app
cp -r ../pubit_app/WebContent/WEB-INF/lib/* lib
rm lib/pubit_props_local.jar

find . -name ".svn" -type d -exec rm -rf {} \;
rm app/com/bn/pubit/client/util/Base64.java

git status

