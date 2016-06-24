#!/bin/bash
# This script installs the corresponding Web page and sources on
# my Web server. No interest to anybody except me.

WEBSOURCE=/home/kevin/docs/kzone5/source
WEBTARGET=/home/kevin/docs/kzone5/target
mvn clean
(cd ..; zip -r $WEBTARGET/suntimes_ws.zip suntimes_ws/)
cp *.html $WEBSOURCE
cp *.png $WEBTARGET
(cd $WEBSOURCE/..; ./make.pl suntimes_ws)


