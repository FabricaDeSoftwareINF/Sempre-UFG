#!/bin/sh
# Script para popular o postgres cm os dados necessarios para rodar os testes

set -e

echo "Exectando em : $(pwd)"

export PGFOLDER='db/postgres'

# Assumindo que já foi executado pelo Travis como um passo base
# psql -h localhost -U postgres -a -f db/postgres/cria-usuario-e-db.sql

export PGDATABASE='sempreufg'
export PGUSER='sempreufg'
export PGPASSWORD='sempreufg'

psql -h localhost -a -f $PGFOLDER/ddl/RD-TodasVisoesIntegradas.sql
