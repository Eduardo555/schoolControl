<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:simpletemplate title="Cadastro de Alunos">
	<jsp:attribute name="content">
		
		<div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Cadastro de Alunos</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="#">Alunos</a></li>
                                    <li class="active">Cadastro</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
		<form action="SalvarAlunos" method="post">
		<div class="content">
			<div class="row">
				<div class="col-sm-12">
					
					<div class="card">
                        <div class="card-body card-block">
                                <div class="form-group"><label for="company" class=" form-control-label">Nome</label><input type="text" id="TxtNome" placeholder="Nome do alino" class="form-control"></div>
                                <div class="form-group"><label for="vat" class=" form-control-label">Local</label><input type="text" id="vat" placeholder="Informe o local fisico" class="form-control"></div>
                                <div class="form-group"><label for="street" class=" form-control-label">Data Inicio</label><input type="text" id="street" placeholder="Informe a data de inicio" class="form-control"></div>
                            </div>
                        
                        <div class="card-footer">
                            <button type="submit" class="btn btn-success btn-sm">
                                <i class="fa fa-dot-circle-o"></i> SALVAR
                            </button>
                            <button type="reset" class="btn btn-danger btn-sm">
                                <i class="fa fa-ban"></i> EXCLUIR
                            </button>
                        </div>
                    </div>
					
				</div>
			</div>
		</div>
		</form>
		
	</jsp:attribute>
</mt:simpletemplate>
