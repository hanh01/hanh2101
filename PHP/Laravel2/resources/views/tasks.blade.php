@extends('layouts.app')

@section('content')

{{--    dinh nghia noi dung cua trang task--}}
    <div class="panel-body">

{{--        hien thi thong bao loi--}}
        @include('errors.503')

{{--        nhap thong tin task moi--}}
        <form action="{{url('task')}}" method="post" class="form-horizontal">
            {{csrf_field()}}

            <div class="form-group">
                <label for="task" class="col-sm-3 control-label">Task</label>
                <div class="col-sm-6">
                    <input type="text" name="name" id="task-name" class="form-control">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-6">
                    <button type="submit" class="btn btn-default">
                        <i class="fa fa-plus"></i>Add Task
                    </button>
                    <br/><br/>
                </div>
            </div>
        </form>

        @if(count($tasks) > 0)
            <div class="panel panel-default">
                <div class="panel-heading">
                    Current Task
                </div>
                <div class="panel-body">
                    <table class="table table-striped task-table">
                        <thead>
                            <td>Tasks</td>
                            <td>&nbsp:</td>
                        </thead>
                        <tbody>
                            @foreach($tasks as $task)
                                <tr>
                                    <td class="table-text">
                                        <div>{{$task->name}}</div>
                                    </td>
                                    <td>
                                        <form action="/task/{{$task->id}}" method="post">
                                            {{csrf_field()}}
                                            {{method_field('DELETE')}}
                                            <button>Delete Task</button>
                                            <input type="hidden" name="method" value="DELETE">
                                        </form>
                                    </td>
                                </tr>
                                @endforeach
                        </tbody>
                    </table>
                </div>
            </div>
            @endif
    </div>

    @endsection
