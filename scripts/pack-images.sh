#!/bin/bash

echo "Setting the default builder for pack"
pack set-default-builder cloudfoundry/cnb:bionic

echo "Packing the Service"
cd ../api.twitter.posts
pack build scg-api-twitter-posts --env "BP_JAVA_VERSION=8.*"
cd ../scripts

echo "Packing the Eureka Discovery Server"
cd ../api.registry
pack build scg-api-registry --env "BP_JAVA_VERSION=8.*"
cd ../scripts

echo "Packing the Spring Cloud Gateway"
cd ../api.gateway
pack build scg-api-gateway --env "BP_JAVA_VERSION=8.*"
cd ../scripts
