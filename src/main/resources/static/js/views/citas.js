const citas = new class Citas {
    constructor() {
        this.base_url = window.location.protocol + "//" + window.location.host + "/" + window.location.pathname.split('/')[1];
        this.tblCitas = $('#table');
        this.bntNuevaCita = $('#btnNuevaCita');
    }

    init() {
        console.log('ejecutando el init');
        this.tblCitas.bootstrapTable({
            url: this.base_url + '/api/obtenercitas',
            columns: [
                {field: 'consultorio.id', title: 'Consultorio'},
                {field: 'medico.nombre', title: 'Nombre Medico', formatter: (value, row) => citas.nombreFormatter(row)},
                {field: 'medico.especialidad', title: 'Especialidad'},
                {field: 'horaConsulta', title: 'Hora Consulta'},
                {field: 'paciente', title: 'Paciente'},
                {title: 'Acciones', formatter: (value, row) => citas.accionesFormatter(value)},
            ]
        });

        citas.bntNuevaCita.click(() => citas.mostrarModal());
    }

    mostrarModal() {
        $.ajax({
            type: 'GET',
            url: citas.base_url + '/modal',
            contentType: 'application/html; charset=utf-8',
            success: (resultado) => {
                try {
                    bootbox.dialog({
                        title: 'Nueva Cita',
                        onEscape: true,
                        animate: true,
                        size: 'extra-large',
                        message: resultado,
                        buttons: {
                            cancel: {
                                label: 'Cancelar',
                                className: 'btn-danger'
                            },
                            save: {
                                label: 'Guardar',
                                className: 'btn-success',
                                callback: function() {
                                    console.log('peticion para guardar');
                                    return false;
                                }
                            }
                        }
                    }).on('shown.bs.modal', function () {});
                } catch (error) {
                    bootbox.alert({
                        message: "Error al cargar el formulario para crear una nueva cita!",
                        className: 'rubberBand animated'
                    });
                }
            }
        });
    }
    
    nombreFormatter(row) {
        return row.medico.nombre + ' ' + row.medico.apellidoPaterno + ' ' + row.medico.apellidoMaterno;
    }

    accionesFormatter(value, row) {
        return [
			'&nbsp;<a class="btn btn-warning btn-sm text-white" role="button" href="#" data-toggle="tooltip" data-placement="top" title="Editar Rol"><i class="bi bi-pencil-fill"></i></a>',
			'&nbsp;<a class="btn btn-danger btn-sm" role="button" href="#" data-toggle="tooltip" data-placement="top" title="Borrar Rol"><i class="bi bi-trash3-fill"></i></a>'
		].join('');
    }
}

citas.init();