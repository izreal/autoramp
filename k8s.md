Run stuff in Kubernetes

Bring everything up
```
kubectl create -f k8s/hivemqservice.yml
kubectl create -f k8s/hivemq.yml
kubectl create -f k8s/zooservice.yml
kubectl create -f k8s/zookeeper.yml   
kubectl create -f k8s/kafkaservice.yml
kubectl create -f k8s/kafkabroker.yml
kubectl create -f k8s/autorampservice.yml
kubectl create -f k8s/autoramp.yml
kubectl create -f k8s/nginx-ingress.yml
```

Bring everything down (in reverse order)
```
kubectl delete -f k8s/nginx-ingress.yml
kubectl delete -f k8s/autoramp.yml
kubectl delete -f k8s/autorampservice.yml
kubectl delete -f k8s/kafkabroker.yml
kubectl delete -f k8s/kafkaservice.yml
kubectl delete -f k8s/zookeeper.yml   
kubectl delete -f k8s/zooservice.yml
kubectl delete -f k8s/hivemq.yml
kubectl delete -f k8s/hivemqservice.yml
```