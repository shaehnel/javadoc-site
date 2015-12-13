# javadoc-site

Maven site with aggregate Javadoc fails with Maven multi-module project having test-jar dependency

Run the following Maven command:

    mvn clean site site-deploy

Result:

    [ERROR] Failed to execute goal on project javadoc-site-module-2: Could not resolve dependencies for project com.foo:javadoc-site-module-2:jar:1.6-SNAPSHOT: Could not find artifact com.foo:javadoc-site-module-1:jar:tests:1.6-SNAPSHOT -> [Help 1]


