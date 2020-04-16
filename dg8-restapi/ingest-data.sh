#!/usr/bin/env bash
set -e

status=0
for f in data/*.json
do 
  curl -u developer:$PASSWORD -XPOST --data-binary @${f}  -H "Content-Type: application/json; charset=UTF-8"  $LB/rest/v2/caches/pokemon/$(basename $f .json)
  let status=status+1
  echo  "Imported $f (total $status pokemons)"
done
