<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:simpletemplate title="Listagem de Alunos">
	<jsp:attribute name="content">
		
		<div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Listagem de Alunos</h1>
                            </div>
                        </div>
                    </div>
                    <form action="../../SalvarAlunos" method="get">
                    <input type="submit" class="btn btn-success btn-sm" value="SALVAR" />
                    </form>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">Alunos</a></li>
                                    <li class="active">Listagem</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
		
	</jsp:attribute>
</mt:simpletemplate>