# Pub/Sub 測試

登入

``` bash
export PROJECT_ID=das-ct-lab

gcloud auth login
gcloud config set project $PROJECT_ID
```

建立主題

``` bash
gcloud pubsub topics create sam-test-topic1
```

output

``` bash
Created topic [projects/das-ct-lab/topics/sam-test-topic1].
```

``` bash
export TOPIC=sam-test-topic1
export SUBSCRIBER=sam-test-topic1-sub
gcloud pubsub subscriptions create $SUBSCRIBER --topic $TOPIC
```

output

``` bash
Created subscription [projects/das-ct-lab/subscriptions/sam-test-topic1-sub].
```
