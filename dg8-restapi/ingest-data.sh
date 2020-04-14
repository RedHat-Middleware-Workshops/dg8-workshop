#!/usr/bin/env bash
set -e

status=0
for f in data/*.json
do 
  curl -u developer:NdFINF2E3CmRMbN3 -XPOST --data-binary @${f}  -H "Content-Type: application/json; charset=UTF-8"  $EP/rest/v2/caches/pokemon/$(basename $f .json)
  let status=status+1
  echo  "Imported $f (total $status pokemons)"
done
